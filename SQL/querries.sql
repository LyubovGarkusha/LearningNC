-- QUIZZES -----------------------------------------------------------
-- // get all quizzes
SELECT t.* FROM backend.quiz t
-- // add new quiz
INSERT INTO `backend`.`quiz` (`url`, `shared`, `timer`, `quiz_theme`, `user_id`, `creation_date`, `last_modify_date`) VALUES ('https:/quiz/q/5', DEFAULT, 'NULL', 'TECHNICAL', 2, '2020-04-24 12:51:19', '2020-04-24 12:51:15')
-- // update quizList
-- // delete quiz by id
