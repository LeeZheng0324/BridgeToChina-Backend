package com.btchina.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.btchina.question.entity.Question;
import com.btchina.question.model.form.AddQuestionForm;

/**
 * <p>
 * 问答表 服务类
 * </p>
 *
 * @author franky
 * @since 2023-02-01
 */
public interface QuestionService extends IService<Question> {

    Boolean addQuestion(AddQuestionForm addQuestionForm);
}
