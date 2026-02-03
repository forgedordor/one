package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxqq extends cayv {
    public static final cqce a = cqce.g("Bugle", "RichCardMediaUriCleanupHandler");
    public final bxlc b;
    private final eosc c;

    public bxqq(eosc eoscVar, bxlc bxlcVar) {
        this.c = eoscVar;
        this.b = bxlcVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RichCardMediaUriCleanupHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return bxqs.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final bxqs bxqsVar = (bxqs) evuhVar;
        final String str = bxqsVar.b;
        if (TextUtils.isEmpty(str)) {
            a.r("empty uri was requested to be cleaned up");
            return eijx.e(cbcw.k());
        }
        if (!TextUtils.isEmpty(bxqsVar.c)) {
            return eijx.g(new Callable() { // from class: bxqm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final MessageIdType messageIdTypeB = bary.b(bxqsVar.c);
                    cqbd cqbdVarC = bxqq.a.c();
                    cqbdVarC.I("removing obsolete uri");
                    cqbdVarC.d(messageIdTypeB);
                    cqbdVarC.r();
                    String[] strArr = PartsTable.a;
                    bsjh bsjhVar = new bsjh();
                    bsjhVar.ap("RichCardMediaUriCleanupHandler#processPendingWorkItemAsync1");
                    bsjhVar.A();
                    final String str2 = str;
                    bsjhVar.D(new Function() { // from class: bxqn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsjl bsjlVar = (bsjl) obj;
                            bsjlVar.n(messageIdTypeB);
                            bsjlVar.v(Uri.parse(str2));
                            return bsjlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsjhVar.b().e();
                    final bxqq bxqqVar = this.a;
                    Consumer consumer = new Consumer() { // from class: bxqo
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ConversationIdType conversationIdTypeD = ((MessagesTable.BindData) obj).D();
                            if (conversationIdTypeD.b()) {
                                return;
                            }
                            bxqqVar.b.l(conversationIdTypeD, messageIdTypeB, new String[0]);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    };
                    Runnable runnable = new Runnable() { // from class: bxqp
                        @Override // java.lang.Runnable
                        public final void run() {
                            cqbd cqbdVarE = bxqq.a.e();
                            cqbdVarE.I("message not found");
                            cqbdVarE.d(messageIdTypeB);
                            cqbdVarE.r();
                        }
                    };
                    MessagesTable.BindData bindDataB = MessagesTable.b(messageIdTypeB);
                    if (bindDataB != null) {
                        consumer.z(bindDataB);
                    } else {
                        runnable.run();
                    }
                    return cbcw.i();
                }
            }, this.c);
        }
        a.r("empty message id when requesting URI cleanup");
        return eijx.e(cbcw.k());
    }
}
