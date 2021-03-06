package com.Danish;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.2.0.
 */
public class Deliverables extends Contract {
    private static final String BINARY = "{\r\n"
            + "\t\"linkReferences\": {},\r\n"
            + "\t\"object\": \"6060604052341561000f57600080fd5b6064600081905550610127806100266000396000f300606060405260043610605d576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680632baeceb7146062578063a632a2e5146074578063a95c372d146094578063d09de08a1460ba575b600080fd5b3415606c57600080fd5b607260cc565b005b3415607e57600080fd5b6092600480803590602001909190505060da565b005b3415609e57600080fd5b60a460e4565b6040518082815260200191505060405180910390f35b341560c457600080fd5b60ca60ed565b005b600160005403600081905550565b8060008190555050565b60008054905090565b6001600054016000819055505600a165627a7a72305820731fdfd8c6872559a9f510bb606476cfa796b4f8f6fbb63ba4a4002d5c43b8240029\",\r\n"
            + "\t\"opcodes\": \"PUSH1 0x60 PUSH1 0x40 MSTORE CALLVALUE ISZERO PUSH2 0xF JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0x64 PUSH1 0x0 DUP2 SWAP1 SSTORE POP PUSH2 0x127 DUP1 PUSH2 0x26 PUSH1 0x0 CODECOPY PUSH1 0x0 RETURN STOP PUSH1 0x60 PUSH1 0x40 MSTORE PUSH1 0x4 CALLDATASIZE LT PUSH1 0x5D JUMPI PUSH1 0x0 CALLDATALOAD PUSH29 0x100000000000000000000000000000000000000000000000000000000 SWAP1 DIV PUSH4 0xFFFFFFFF AND DUP1 PUSH4 0x2BAECEB7 EQ PUSH1 0x62 JUMPI DUP1 PUSH4 0xA632A2E5 EQ PUSH1 0x74 JUMPI DUP1 PUSH4 0xA95C372D EQ PUSH1 0x94 JUMPI DUP1 PUSH4 0xD09DE08A EQ PUSH1 0xBA JUMPI JUMPDEST PUSH1 0x0 DUP1 REVERT JUMPDEST CALLVALUE ISZERO PUSH1 0x6C JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0x72 PUSH1 0xCC JUMP JUMPDEST STOP JUMPDEST CALLVALUE ISZERO PUSH1 0x7E JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0x92 PUSH1 0x4 DUP1 DUP1 CALLDATALOAD SWAP1 PUSH1 0x20 ADD SWAP1 SWAP2 SWAP1 POP POP PUSH1 0xDA JUMP JUMPDEST STOP JUMPDEST CALLVALUE ISZERO PUSH1 0x9E JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0xA4 PUSH1 0xE4 JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 DUP3 DUP2 MSTORE PUSH1 0x20 ADD SWAP2 POP POP PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST CALLVALUE ISZERO PUSH1 0xC4 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0xCA PUSH1 0xED JUMP JUMPDEST STOP JUMPDEST PUSH1 0x1 PUSH1 0x0 SLOAD SUB PUSH1 0x0 DUP2 SWAP1 SSTORE POP JUMP JUMPDEST DUP1 PUSH1 0x0 DUP2 SWAP1 SSTORE POP POP JUMP JUMPDEST PUSH1 0x0 DUP1 SLOAD SWAP1 POP SWAP1 JUMP JUMPDEST PUSH1 0x1 PUSH1 0x0 SLOAD ADD PUSH1 0x0 DUP2 SWAP1 SSTORE POP JUMP STOP LOG1 PUSH6 0x627A7A723058 KECCAK256 PUSH20 0x1FDFD8C6872559A9F510BB606476CFA796B4F8F6 CREATE2 0xb6 EXTCODESIZE LOG4 LOG4 STOP 0x2d 0x5c NUMBER 0xb8 0x24 STOP 0x29 \",\r\n"
            + "\t\"sourceMap\": \"26:440:0:-;;;71:58;;;;;;;;118:3;111:6;:10;;;;26:440;;;;;;\"\r\n"
            + "}";

    protected Deliverables(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Deliverables(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> decrement() {
        Function function = new Function(
                "decrement", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setnumber(BigInteger thenewvalue) {
        Function function = new Function(
                "setnumber", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(thenewvalue)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> fetch() {
        Function function = new Function("fetch", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> increment() {
        Function function = new Function(
                "increment", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Deliverables> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Deliverables.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Deliverables> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Deliverables.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static Deliverables load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Deliverables(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Deliverables load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Deliverables(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
