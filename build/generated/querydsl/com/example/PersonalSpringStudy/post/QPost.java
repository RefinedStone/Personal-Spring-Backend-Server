package com.example.PersonalSpringStudy.post;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPost is a Querydsl query type for Post
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPost extends EntityPathBase<Post> {

    private static final long serialVersionUID = 1524684523L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPost post = new QPost("post");

    public final com.example.PersonalSpringStudy.QTimestamped _super = new com.example.PersonalSpringStudy.QTimestamped(this);

    public final com.example.PersonalSpringStudy.account.entity.QAccount account;

    public final ListPath<com.example.PersonalSpringStudy.comment.entity.Comment, com.example.PersonalSpringStudy.comment.entity.QComment> comment = this.<com.example.PersonalSpringStudy.comment.entity.Comment, com.example.PersonalSpringStudy.comment.entity.QComment>createList("comment", com.example.PersonalSpringStudy.comment.entity.Comment.class, com.example.PersonalSpringStudy.comment.entity.QComment.class, PathInits.DIRECT2);

    public final StringPath contents = createString("contents");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.example.PersonalSpringStudy.likes.Likes, com.example.PersonalSpringStudy.likes.QLikes> likes = this.<com.example.PersonalSpringStudy.likes.Likes, com.example.PersonalSpringStudy.likes.QLikes>createList("likes", com.example.PersonalSpringStudy.likes.Likes.class, com.example.PersonalSpringStudy.likes.QLikes.class, PathInits.DIRECT2);

    public final NumberPath<Long> likesLength = createNumber("likesLength", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final EnumPath<PostType> postType = createEnum("postType", PostType.class);

    public final StringPath title = createString("title");

    public final StringPath urlKey = createString("urlKey");

    public final StringPath urlToString = createString("urlToString");

    public QPost(String variable) {
        this(Post.class, forVariable(variable), INITS);
    }

    public QPost(Path<? extends Post> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPost(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPost(PathMetadata metadata, PathInits inits) {
        this(Post.class, metadata, inits);
    }

    public QPost(Class<? extends Post> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.account = inits.isInitialized("account") ? new com.example.PersonalSpringStudy.account.entity.QAccount(forProperty("account")) : null;
    }

}

