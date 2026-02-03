package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class bael {
    public final bfsa a;

    public bael(bfsa bfsaVar) {
        this.a = bfsaVar;
    }

    public final bgve a(ConversationIdType conversationIdType, int i) {
        bgvg bgvgVarA = this.a.a();
        String[] strArr = bgvl.a;
        bgvk bgvkVar = new bgvk();
        bgvkVar.b(conversationIdType);
        bgvgVarA.e(bgvkVar);
        if (i > 0) {
            bgvgVarA.y(i);
        }
        bgvgVarA.A("getConversationMessagesQuery");
        return bgvgVarA.b();
    }

    public final bgve b(final MessageIdType messageIdType) {
        bgvg bgvgVarA = this.a.a();
        bgvgVarA.A("+getMessageByIdQueryModified");
        bgvgVarA.f(new Function() { // from class: baee
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bgvk bgvkVar = (bgvk) obj;
                bgvkVar.c(messageIdType);
                return bgvkVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bgvgVarA.y(1);
        return bgvgVarA.b();
    }

    public final bgve c(final long j, boolean z) {
        bgvd bgvdVar = z ? new bgvd(bgvl.c.d, true) : new bgvd(bgvl.c.d, false);
        bgvg bgvgVarA = this.a.a();
        bgvgVarA.f(new Function() { // from class: baec
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bgvk bgvkVar = (bgvk) obj;
                bgvkVar.e(j);
                return bgvkVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bgvgVarA.w(bgvl.c.a);
        bgvgVarA.c(bgvdVar);
        return bgvgVarA.b();
    }

    public final bgvg d(ConversationIdType conversationIdType, int i, int i2, boolean z) {
        dqwl dqwlVarB;
        if (z) {
            bjqo bjqoVarD = bjdl.d(conversationIdType, i);
            bjqoVarD.d(new Function() { // from class: baei
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bjqq bjqqVar = (bjqq) obj;
                    bjqqVar.b();
                    return bjqqVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bjqoVarD.c(new bjql(bjqr.b.b));
            bjqoVarD.y(i);
            bjqoVarD.B(i2);
            dqwlVarB = bjqoVarD.b();
        } else {
            bjjp bjjpVarB = bjdl.b(conversationIdType, i);
            bjjpVarB.d(new Function() { // from class: baej
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bjjt bjjtVar = (bjjt) obj;
                    bjjtVar.c();
                    return bjjtVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bjjpVarB.c(new bjjm(bjju.b.b));
            bjjpVarB.y(i);
            bjjpVarB.B(i2);
            dqwlVarB = bjjpVarB.b();
        }
        return this.a.d(z, conversationIdType, dqwlVarB);
    }

    public final bgvg e(ConversationIdType conversationIdType, int i, int i2) {
        return d(conversationIdType, i, i2, true);
    }

    public final bgve f(MessageIdType[] messageIdTypeArr) {
        bgvg bgvgVarE = this.a.e(false, barn.a);
        String[] strArr = bgvl.a;
        bgvk bgvkVar = new bgvk();
        bgvkVar.ap(new dqpm("messages._id", 3, bgvk.as((Iterable) DesugarArrays.stream(messageIdTypeArr).map(new Function() { // from class: bgvi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf(bary.a((MessageIdType) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bgvj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }))), true));
        bgvgVarE.e(bgvkVar);
        bgvgVarE.s();
        return bgvgVarE.b();
    }

    public final bgvg g(ConversationIdType conversationIdType, int i) {
        return d(conversationIdType, i, 0, false);
    }
}
