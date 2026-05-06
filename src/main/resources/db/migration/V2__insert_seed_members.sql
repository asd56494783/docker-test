INSERT INTO members (name, email, level, active)
SELECT 'Amy Chen', 'amy.chen@example.com', 'GOLD', b'1'
WHERE NOT EXISTS (
    SELECT 1 FROM members WHERE email = 'amy.chen@example.com'
);

INSERT INTO members (name, email, level, active)
SELECT 'Brian Lin', 'brian.lin@example.com', 'SILVER', b'1'
WHERE NOT EXISTS (
    SELECT 1 FROM members WHERE email = 'brian.lin@example.com'
);

INSERT INTO members (name, email, level, active)
SELECT 'Cindy Wang', 'cindy.wang@example.com', 'BASIC', b'0'
WHERE NOT EXISTS (
    SELECT 1 FROM members WHERE email = 'cindy.wang@example.com'
);
