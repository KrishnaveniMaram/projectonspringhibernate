package com.bankapp.model.persistance;

import java.util.List;

public interface AccountDao {
public List<Account>getAllAccounts();
public void update(Account account);
public Account find(int id);
}
