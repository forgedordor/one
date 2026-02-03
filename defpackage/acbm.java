package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.gaia.expresssignin.BugleExpressSignInActivity;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbm implements efzg, efzh {
    final eosc a;
    private final Context b;
    private final cdku c;
    private final fcsu d;

    public acbm(Context context, cdku cdkuVar, fcsu fcsuVar, eosc eoscVar) {
        this.b = context;
        this.c = cdkuVar;
        this.d = fcsuVar;
        this.a = eoscVar;
    }

    @Override // defpackage.efzc
    public final ListenableFuture a(efzi efziVar) {
        Bundle extras = ((egal) efziVar).a.getExtras();
        Intent intentA = aiiw.c(this.b, BugleExpressSignInActivity.class, "android.intent.action.VIEW").a();
        if (extras != null) {
            intentA.putExtras(extras);
        }
        if (intentA.getIntExtra("EXPRESS_SIGN_IN_FLOW_KEY", -1) == 3 && !intentA.hasExtra("LAUNCH_CONTEXT")) {
            intentA.putExtra("LAUNCH_CONTEXT", "NOT_SIGNED_IN");
        }
        return eork.i(intentA);
    }

    @Override // defpackage.efzg
    public final ListenableFuture b(final Intent intent) {
        if (cpyl.a() && ((Boolean) ((cczi) cpxw.a.get()).e()).booleanValue() && intent.getIntExtra("EXPRESS_SIGN_IN_FLOW_KEY", -1) == 1) {
            return ((aurx) this.d.b()).z(new Function() { // from class: auor
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    aumg aumgVar = (aumg) obj;
                    cqce cqceVar = aurx.a;
                    aumgVar.copyOnWrite();
                    aumq aumqVar = (aumq) aumgVar.instance;
                    aumq aumqVar2 = aumq.a;
                    aumqVar.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                    aumqVar.A = true;
                    return aumgVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).h(new ejvr() { // from class: acbk
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return intent;
                }
            }, this.a);
        }
        final cdku cdkuVar = this.c;
        return cdkuVar.c.j(new ejvr() { // from class: cdka
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cdjq cdjqVar = (cdjq) ((cdjt) obj).toBuilder();
                cdjqVar.copyOnWrite();
                cdjt cdjtVar = (cdjt) cdjqVar.instance;
                cdjtVar.b |= 1;
                cdjtVar.c = true;
                return (cdjt) cdjqVar.build();
            }
        }).h(new ejvr() { // from class: cdkb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cdkuVar.e();
                return null;
            }
        }, cdkuVar.d).h(new ejvr() { // from class: acbl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return intent;
            }
        }, this.a);
    }
}
