package com.example.PersonalSpringStudy.account.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAccount is a Querydsl query type for Account
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAccount extends EntityPathBase<Account> {

    private static final long serialVersionUID = -1700801946L;

    public static final QAccount account = new QAccount("account");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imgKey = createString("imgKey");

    public final StringPath imgUrl = createString("imgUrl");

    public final BooleanPath isAccepted = createBoolean("isAccepted");

    public final BooleanPath isDeleted = createBoolean("isDeleted");

    public final StringPath nickname = createString("nickname");

    public final StringPath password = createString("password");

    public QAccount(String variable) {
        super(Account.class, forVariable(variable));
    }

    public QAccount(Path<? extends Account> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAccount(PathMetadata metadata) {
        super(Account.class, metadata);
    }

}

