package defpackage;

import android.app.Activity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agel implements afyw {
    public final Activity a;
    public final efxf b;
    private final Optional c;

    public agel(Optional optional, Activity activity, efxf efxfVar) {
        this.c = optional;
        this.a = activity;
        this.b = efxfVar;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        final fdap fdapVar = new fdap() { // from class: agej
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((acbn) obj).getClass();
                agel agelVar = this.a;
                agelVar.a.getIntent().putExtra("EXPRESS_SIGN_IN_FLOW_KEY", 6);
                acbn.a(agelVar.b);
                return fctx.a;
            }
        };
        this.c.ifPresent(new Consumer() { // from class: agek
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return fctx.a;
    }
}
