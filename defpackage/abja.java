package defpackage;

import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abja extends abjb {
    public static final cczv a = cdag.q(188802598, "block_create_if_feature_disabled");
    public static final cqce b = cqce.g("Bugle", "DittoWebActivityPeer");
    public final DittoWebActivity c;
    public final fcsu d;
    public final fcsu e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;

    public abja(DittoWebActivity dittoWebActivity, eygg eyggVar, fcsu fcsuVar, eygg eyggVar2, eygg eyggVar3, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.c = dittoWebActivity;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.h = fcsuVar3;
        this.g = fcsuVar4;
        this.i = fcsuVar5;
        final efxf efxfVar = (efxf) eyggVar.b();
        egap egapVarE = egaq.e(dittoWebActivity);
        egapVarE.d(abhz.class);
        efxfVar.g(egapVarE.a());
        efxfVar.e((efzm) eyggVar2.b());
        abib abibVar = (abib) eyggVar3.b();
        abibVar.a.set(new Runnable() { // from class: abiy
            @Override // java.lang.Runnable
            public final void run() {
                final abja abjaVar = this.a;
                Optional optional = (Optional) abjaVar.h.b();
                final efxf efxfVar2 = efxfVar;
                optional.ifPresent(new Consumer() { // from class: abix
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        abjaVar.c.getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", 5);
                        acbn.a(efxfVar2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
    }

    public static boolean a(DittoWebActivity dittoWebActivity) {
        return (dittoWebActivity.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
