package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuey extends cmwg {
    public final fcsu a;
    public final eygg b;
    private final Context c;
    private final eosc d;

    public cuey(Context context, fcsu fcsuVar, eosc eoscVar, eygg eyggVar) {
        this.c = context;
        this.a = fcsuVar;
        this.d = eoscVar;
        this.b = eyggVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("PhenotypeRestoreStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        ((ccyw) this.a.b()).d(this.c);
        return eiju.g(eiju.g(((cmfk) this.b.b()).a.a()).h(new ejvr() { // from class: cmfi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((aiiv) obj).d);
            }
        }, eoqg.a)).i(new eooz() { // from class: cuew
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eork.i(null);
                }
                cuey cueyVar = this.a;
                ((ccyw) cueyVar.a.b()).e();
                ecjh ecjhVar = ((cmfk) cueyVar.b.b()).a;
                ejvr ejvrVar = new ejvr() { // from class: cmfj
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        aiiu aiiuVar = (aiiu) ((aiiv) obj2).toBuilder();
                        aiiuVar.copyOnWrite();
                        aiiv aiivVar = (aiiv) aiiuVar.instance;
                        aiivVar.b |= 4;
                        aiivVar.d = false;
                        return (aiiv) aiiuVar.build();
                    }
                };
                eoqg eoqgVar = eoqg.a;
                return eiju.g(ecjhVar.b(ejvrVar, eoqgVar)).e(IOException.class, new ejvr() { // from class: cuex
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, eoqgVar);
            }
        }, this.d);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return false;
    }
}
