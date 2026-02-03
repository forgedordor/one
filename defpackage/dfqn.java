package defpackage;

import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfqn extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;
    private final eyir f;

    public dfqn(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4, eyir eyirVar5) {
        super(eyikVar2, new eyji(dfqn.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
        this.f = eyje.c(eyirVar5);
    }

    @Override // defpackage.eyix
    public final /* synthetic */ ListenableFuture b(Object obj) {
        dfwe dfweVarA;
        List list = (List) obj;
        CreateGroupRequest createGroupRequest = (CreateGroupRequest) list.get(0);
        dfwc dfwcVar = (dfwc) list.get(1);
        dgrs dgrsVar = (dgrs) list.get(2);
        dfrq dfrqVar = (dfrq) list.get(3);
        dfrh dfrhVar = (dfrh) list.get(4);
        String[] strArr = (String[]) Collection.EL.stream(createGroupRequest.b()).map(new Function() { // from class: dfqj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((RcsDestinationId) obj2).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() { // from class: dfqk
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return new String[i];
            }
        });
        String strD = createGroupRequest.d();
        String strE = createGroupRequest.e();
        String strA = dfql.a(dgrsVar);
        synchronized (dfwcVar.b) {
            dfvn dfvnVar = new dfvn();
            dfwa dfwaVar = dfwcVar.c;
            dgzn dgznVarCreateOutgoingSession = (dgzn) dfwaVar.get(strD);
            if (dgznVarCreateOutgoingSession == null) {
                dgznVarCreateOutgoingSession = dfwcVar.a.createOutgoingSession(strA);
                dgznVarCreateOutgoingSession.bm();
                dgznVarCreateOutgoingSession.ba(strArr);
                dgznVarCreateOutgoingSession.O = dgyn.CONFERENCE_FACTORY_URI;
                dgznVarCreateOutgoingSession.q = strE;
                dgznVarCreateOutgoingSession.y = strD;
                if (dgznVarCreateOutgoingSession.ai()) {
                    dgznVarCreateOutgoingSession.z = strD;
                }
                dfvnVar.a = 1;
                dgznVarCreateOutgoingSession.aF(new dfwb(dfwcVar, strD, dgznVarCreateOutgoingSession));
                dfwaVar.put(strD, dgznVarCreateOutgoingSession);
            } else {
                dfvnVar.a = 2;
            }
            dfvnVar.b(dgznVarCreateOutgoingSession);
            dfweVarA = dfvnVar.a();
        }
        dfvo dfvoVar = (dfvo) dfweVarA;
        if (dfvoVar.b == 2) {
            dgzn dgznVar = dfvoVar.a;
            dfvv dfvvVarF = dfvw.f();
            dfvvVarF.c(dgznVar);
            return eork.i(dfvvVarF.a());
        }
        dgzn dgznVar2 = dfvoVar.a;
        SettableFuture settableFuture = new dfvu(dgznVar2).a;
        dgznVar2.aF(dfrqVar.a(dgznVar2));
        dgznVar2.aF(dfrhVar.a(dgznVar2));
        dgznVar2.j();
        return settableFuture;
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.f;
        eyir eyirVar2 = this.e;
        eyir eyirVar3 = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar3.d(), eyirVar2.d(), eyirVar.d());
    }
}
