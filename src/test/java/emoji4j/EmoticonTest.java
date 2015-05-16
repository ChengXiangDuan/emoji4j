package emoji4j;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class EmoticonTest {
	@Test
	public void testEmojiByEmoticons() {
		Emoji emoji = EmojiUtils.getEmoji(":)");
		assertThat(emoji.getEmoji()).isEqualTo("😃");

		emoji = EmojiUtils.getEmoji(";]");
		assertThat(emoji.getEmoji()).isEqualTo("😉");

		// invalid emoticon
		emoji = EmojiUtils.getEmoji(";|D");
		assertThat(emoji).isNull();
	}

	@Test
	public void testParseEmoticons() {
		String text=":):-),:-):-]:-xP=*:*<3:P:p,=-)";
		assertThat(EmojiUtils.emojify(text)).isEqualTo("😃😃😅😃😶😝😗😗❤️😛😛😅");
		
		text = "A :cat:, :dog: and a :mouse: became friends<3. For :dog:'s birthday party, they all had :hamburger:s, :fries:s, :cookie:s and :cake:.";
		assertThat(EmojiUtils.emojify(text)).isEqualTo("A 🐱, 🐶 and a 🐭 became friends❤️. For 🐶's birthday party, they all had 🍔s, 🍟s, 🍪s and 🍰.");
	}
	
	//@Test
	//public void testParseShortCodes() {
		//String text = "A :cat:, :dog: and a :mouse: became friends<3. For :dog:'s birthday party, they all had :hamburger:s, :fries:s, :cookie:s and :cake:.";
//		for(Emoji e:EmojiManager.data()) {
//			
//			System.out.println(EmojiUtils.shortCodify(e.getEmoji()));
//		}
		//String text="🇺";
		
		//System.out.println(EmojiUtils.shortCodify(text));
		//System.out.println(EmojiUtils.htmlify(text));
	//}
}
