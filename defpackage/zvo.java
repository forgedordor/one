package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvo {
    private final ckli a;
    private final aisp b;

    public zvo(ckli ckliVar, aisp aispVar) {
        aispVar.getClass();
        this.a = ckliVar;
        this.b = aispVar;
    }

    public final void a(Long l) {
        g(3, 3, l);
    }

    public final void b(Long l) {
        g(2, 3, l);
    }

    public final void c(final ckmc ckmcVar, ckmn ckmnVar, MessageId messageId) {
        ckmcVar.getClass();
        ckmnVar.getClass();
        messageId.getClass();
        final emqr emqrVarA = ckle.a(ckmnVar);
        final MessageIdType messageIdTypeB = bary.b(messageId.a());
        Callable callable = new Callable() { // from class: cklm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (emzs) MessagesTable.i(messageIdTypeB, new Function() { // from class: ckll
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        emzr emzrVar = (emzr) emzs.a.createBuilder();
                        long jB = ((MessagesTable.BindData) obj).B();
                        emzrVar.copyOnWrite();
                        emzs emzsVar = (emzs) emzrVar.instance;
                        emzsVar.b |= 1;
                        emzsVar.c = jB;
                        return (emzs) emzrVar.build();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        };
        final ckli ckliVar = this.a;
        auvh.h(eijx.g(callable, ckliVar.b.a).i(new eooz() { // from class: cklh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                emzs emzsVar = (emzs) obj;
                emoo emooVar = (emoo) emop.a.createBuilder();
                emqo emqoVar = emqo.a;
                emooVar.copyOnWrite();
                emop emopVar = (emop) emooVar.instance;
                emqoVar.getClass();
                emopVar.f = emqoVar;
                emopVar.e = 209;
                emqp emqpVar = (emqp) emqs.a.createBuilder();
                emqpVar.copyOnWrite();
                emqs emqsVar = (emqs) emqpVar.instance;
                emqsVar.c = emqrVarA.k;
                int i = 1;
                emqsVar.b |= 1;
                emooVar.copyOnWrite();
                emop emopVar2 = (emop) emooVar.instance;
                emqs emqsVar2 = (emqs) emqpVar.build();
                emqsVar2.getClass();
                emopVar2.d = emqsVar2;
                emopVar2.c = 103;
                emop emopVar3 = (emop) emooVar.build();
                int iOrdinal = ckmcVar.ordinal();
                if (iOrdinal == 1) {
                    i = 2;
                } else if (iOrdinal == 2) {
                    i = 3;
                } else if (iOrdinal == 3) {
                    i = 6;
                }
                return ckliVar.a.d(i, emopVar3, -1, emzsVar);
            }
        }, eoqg.a));
    }

    public final void d(ckmc ckmcVar, ckmn ckmnVar, Long l) {
        int i;
        ckmcVar.getClass();
        ckmnVar.getClass();
        int i2 = 4;
        if (!fcva.g(ckmn.REACTION_BAR, ckmn.CUSTOM_REACTION_PICKER, ckmn.MEDIA_VIEWER_REACTION_PICKER, ckmn.DOUBLE_TAP_TO_REACT).contains(ckmnVar)) {
            Objects.toString(ckmnVar);
            throw new IllegalArgumentException("Select event not allowed in reaction surface: ".concat(ckmnVar.toString()));
        }
        int iOrdinal = ckmcVar.ordinal();
        if (iOrdinal == 1) {
            i = 4;
        } else if (iOrdinal == 2) {
            i = 6;
        } else {
            if (iOrdinal != 3) {
                Objects.toString(ckmcVar);
                throw new IllegalArgumentException("Cannot log a reaction event with an unspecified action: ".concat(ckmcVar.toString()));
            }
            i = 5;
        }
        int iOrdinal2 = ckmnVar.ordinal();
        if (iOrdinal2 == 1) {
            i2 = 2;
        } else if (iOrdinal2 == 2) {
            i2 = 3;
        } else if (iOrdinal2 != 4) {
            if (iOrdinal2 == 8) {
                i2 = 6;
            } else {
                if (iOrdinal2 != 9) {
                    Objects.toString(ckmnVar);
                    throw new IllegalArgumentException("Cannot log a reaction event with an unspecified surface: ".concat(ckmnVar.toString()));
                }
                i2 = 5;
            }
        }
        g(i, i2, l);
    }

    public final void e(Long l) {
        g(3, 2, l);
    }

    public final void f(Long l) {
        g(2, 2, l);
    }

    public final void g(int i, int i2, Long l) {
        enuq enuqVarA = enup.a((enkn) enko.a.createBuilder());
        enkr enkrVar = (enkr) enku.a.createBuilder();
        enkrVar.getClass();
        enkrVar.copyOnWrite();
        enku enkuVar = (enku) enkrVar.instance;
        enkuVar.c = i - 1;
        enkuVar.b |= 1;
        enkrVar.copyOnWrite();
        enku enkuVar2 = (enku) enkrVar.instance;
        enkuVar2.d = i2 - 1;
        enkuVar2.b |= 2;
        if (l != null) {
            long jLongValue = l.longValue();
            enkrVar.copyOnWrite();
            enku enkuVar3 = (enku) enkrVar.instance;
            enkuVar3.b |= 4;
            enkuVar3.e = jLongValue;
        }
        aisp aispVar = this.b;
        evsn evsnVarBuild = enkrVar.build();
        evsnVarBuild.getClass();
        enkn enknVar = enuqVarA.a;
        enknVar.copyOnWrite();
        enko enkoVar = (enko) enknVar.instance;
        enkoVar.d = (enku) evsnVarBuild;
        enkoVar.c |= 8;
        aispVar.a(189043, enuqVarA.a());
    }
}
