package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uhl implements ehsl {
    final /* synthetic */ Uri a;
    final /* synthetic */ uho b;

    public uhl(uho uhoVar, Uri uri) {
        this.a = uri;
        this.b = uhoVar;
    }

    @Override // defpackage.ehsl
    public final ejwi a() {
        return ejud.a;
    }

    @Override // defpackage.ehsl
    public final ListenableFuture c() {
        final Uri uri = this.a;
        return eijx.g(new Callable() { // from class: uhk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ehsj ehsjVarA;
                eieu eieuVarK = eiiy.k("ConversationDeeplinkGatewayHandler#getRedirectIntent");
                final Uri uri2 = uri;
                uhl uhlVar = this.a;
                try {
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("ConversationDeeplinkGatewayHandler#getMessage");
                    bran branVar = MessagesTable.c;
                    brao braoVar = branVar.b;
                    brdrVarD.c(branVar.a, braoVar);
                    brdrVarD.h(new Function() { // from class: uhj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            brecVar.aa(uri2);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    botb botbVarE = botm.e();
                    bopp boppVar = botm.c;
                    bopq bopqVar = boppVar.a;
                    botbVarE.c(bopqVar, boppVar.y, boppVar.R);
                    dqtr dqtrVarI = dqts.i(botbVarE.b(), bopqVar, braoVar);
                    ((dqos) dqtrVarI).e = "message_to_conversation_tag";
                    brdrVarD.H(dqtrVarI.g());
                    MessagesTable.BindData bindData = (MessagesTable.BindData) brdrVarD.b().l();
                    if (bindData == null || bindData.D() == null) {
                        ehsjVarA = ehsj.a("Cannot find message by smsUri.");
                    } else {
                        bojh bojhVar = ((bojh[]) bindData.aH("message_to_conversation_tag", new bojh[0]))[0];
                        uho uhoVar = uhlVar.b;
                        ehsjVarA = uhoVar.a(uhoVar.b.a(bojhVar.C(), bojhVar.ab(), bojhVar.an()), bindData.E());
                    }
                    eieuVarK.close();
                    return ehsjVarA;
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.b.a);
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ ehsj e() {
        return ehsk.a();
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ void d() {
    }
}
