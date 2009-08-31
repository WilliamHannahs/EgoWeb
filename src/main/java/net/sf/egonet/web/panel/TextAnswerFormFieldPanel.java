package net.sf.egonet.web.panel;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

import net.sf.egonet.model.Question;

public class TextAnswerFormFieldPanel extends AnswerFormFieldPanel {

	private Model answer;
	
	public TextAnswerFormFieldPanel(String id, Question question) {
		super(id,question);
		this.answer = new Model("");
		build();
	}
	
	public TextAnswerFormFieldPanel(String id, Question question, String answer) {
		super(id,question);
		this.answer = new Model(answer);
		build();
	}
	
	private void build() {
		add(new Label("prompt",question.getPrompt()));
		add(new TextField("answer",answer));
	}

	public String getAnswer() {
		return (String) answer.getObject();
	}
}
