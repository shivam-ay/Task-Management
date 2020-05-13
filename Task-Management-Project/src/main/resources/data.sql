INSERT INTO user(user_id,user_name) VALUES(1,'naruto');
INSERT INTO user(user_id,user_name) VALUES(2,'kirito');

INSERT INTO project (project_id, project_name, project_description, assign_date, deadline,user_id,user_name)
VALUES (1, 'Training', 'Learn Rasengan',NOW(),NOW(),1,'naruto');
INSERT INTO project (project_id, project_name, project_description, assign_date, deadline,user_id,user_name)
VALUES (2, 'Akatsuki', 'Defeat',NOW(),NOW(),1,'naruto');
INSERT INTO project (project_id, project_name, project_description, assign_date, deadline,user_id,user_name)
VALUES (3, 'Sword Skill', 'Level Up',NOW(),NOW(),2,'kirito');