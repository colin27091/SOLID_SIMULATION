package com.Transaction;

import java.util.List;

public interface ITransaction {

    List<Float> transact(List<Float> richesse, int[] pair);

}
