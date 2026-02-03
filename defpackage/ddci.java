package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddci {
    public final Activity a;
    public final ejxr b;

    public ddci(final Activity activity) {
        this.a = activity;
        this.b = new ejxr() { // from class: ddch
            @Override // defpackage.ejxr
            public final Object get() {
                dcfd dcfdVar = ddck.a;
                return new dddj(activity);
            }
        };
    }

    public final int a() {
        int i = dcep.a;
        return dceq.b(this.a, 11925000);
    }

    final void b(int i, GoogleHelp googleHelp) {
        final Intent data = new Intent("android.intent.action.VIEW").setData(googleHelp.q);
        if (i == 7) {
            i = 7;
        } else if (!this.a.getPackageManager().queryIntentActivities(data, 0).isEmpty()) {
            new ddmy(Looper.getMainLooper()).post(new Runnable() { // from class: ddcg
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.startActivity(data);
                }
            });
            return;
        }
        Activity activity = this.a;
        int i2 = dcep.a;
        if (true == dceq.f(activity, i)) {
            i = 18;
        }
        dcdt.a.d(activity, i, 0, null);
    }

    public final void c(final Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int iA = a();
        if (iA != 0) {
            b(iA, (GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP"));
            return;
        }
        Object obj = this.b.get();
        final dddj dddjVar = (dddj) obj;
        dclh.m(dddjVar.a);
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: dddh
            @Override // defpackage.dcir
            public final void a(Object obj2, Object obj3) {
                dddk dddkVar = (dddk) obj2;
                ddce ddceVar = dddkVar.a;
                WeakReference weakReference = new WeakReference(dddjVar.a);
                Intent intent2 = intent;
                GoogleHelp googleHelp = (GoogleHelp) intent2.getParcelableExtra("EXTRA_GOOGLE_HELP");
                ((dddg) ddceVar).a(googleHelp);
                dddn.a(new ddcx(dddkVar, weakReference, intent2, googleHelp.R), googleHelp);
            }
        };
        dcizVar.c = 34401;
        ((dcfm) obj).m(dcizVar.a());
    }

    public final void d(final InProductHelp inProductHelp) {
        if (TextUtils.isEmpty(inProductHelp.c)) {
            throw new IllegalArgumentException("The content URL must be non-empty.");
        }
        int iA = a();
        if (iA != 0) {
            b(iA, inProductHelp.a);
            return;
        }
        Object obj = this.b.get();
        dciz dcizVar = new dciz();
        final dddj dddjVar = (dddj) obj;
        dcizVar.a = new dcir() { // from class: dddi
            @Override // defpackage.dcir
            public final void a(Object obj2, Object obj3) {
                dddk dddkVar = (dddk) obj2;
                ddce ddceVar = dddkVar.a;
                WeakReference weakReference = new WeakReference(dddjVar.a);
                InProductHelp inProductHelp2 = inProductHelp;
                GoogleHelp googleHelp = inProductHelp2.a;
                ((dddg) ddceVar).a(googleHelp);
                dddn.a(new ddcy(inProductHelp2, dddkVar, weakReference, googleHelp.R), googleHelp);
            }
        };
        dcizVar.c = 34402;
        ((dcfm) obj).m(dcizVar.a());
    }
}
