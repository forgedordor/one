package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountActivity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdh implements acdd {
    public final cgus a;
    private final Context b;
    private final fcsu c;
    private final fdjx d;

    public acdh(Context context, fcsu fcsuVar, fdjx fdjxVar, cgus cgusVar) {
        context.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.b = context;
        this.c = fcsuVar;
        this.d = fdjxVar;
        this.a = cgusVar;
    }

    @Override // defpackage.acdd
    public final void a(ea eaVar, efwo efwoVar, final Optional optional) {
        efwoVar.getClass();
        optional.getClass();
        if (abxb.a()) {
            Intent intent = new Intent(this.b, (Class<?>) SignOutAccountActivity.class);
            if (optional.isPresent()) {
                intent.putExtra("EXTRA_ACCOUNT_ID_TO_SWITCH_TO", (Parcelable) optional.get());
            }
            efyp.c(intent, efwoVar);
            eilp.a(eaVar, intent);
            Optional optional2 = (Optional) this.c.b();
            final fdap fdapVar = new fdap() { // from class: acde
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    acei aceiVar = (acei) obj;
                    aceiVar.getClass();
                    ((ains) aceiVar.b.b()).e("Bugle.SignOutAccount.EntryClicked.Count", (true != optional.isPresent() ? 3 : 4) - 2);
                    return fctx.a;
                }
            };
            optional2.ifPresent(new Consumer() { // from class: acdf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (((Boolean) ((cczi) crbf.bt.get()).e()).booleanValue()) {
                auvw.k(this.d, null, null, new acdg(this, null), 3);
            }
        }
    }
}
