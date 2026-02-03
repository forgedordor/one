package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctce {
    public static final cczv a = cdag.m(cdag.b, "simulate_manufacturer_with_watch_texting", false);
    public static final cczv b = cdag.m(cdag.b, "bypass_watch_feature_check", false);
    public final Context c;
    public final fctc d;
    public final fctc e;
    private final fcsu f;
    private final fcsu g;
    private final fctc h;
    private final fctc i;

    public ctce(Context context, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.c = context;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = fctd.a(new fdae() { // from class: ctby
            @Override // defpackage.fdae
            public final Object invoke() {
                boolean z = true;
                if (!this.a.c.getPackageManager().hasSystemFeature("android.hardware.type.watch") && !((Boolean) ctce.b.e()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
        this.i = fctd.a(new fdae() { // from class: ctbz
            @Override // defpackage.fdae
            public final Object invoke() {
                ctce ctceVar = this.a;
                boolean z = false;
                if (ctceVar.b() && ctceVar.c.getPackageManager().hasSystemFeature("com.google.android.feature.p11")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        this.d = fctd.a(new fdae() { // from class: ctca
            @Override // defpackage.fdae
            public final Object invoke() {
                ctce ctceVar = this.a;
                boolean z = false;
                if (ctceVar.b() && crad.a() && !ctceVar.a()) {
                    z = true;
                }
                return Boolean.valueOf((!ctceVar.c()) & z);
            }
        });
        fctd.a(new fdae() { // from class: ctcb
            @Override // defpackage.fdae
            public final Object invoke() {
                ctce ctceVar = this.a;
                boolean zB = false;
                if (ctceVar.b() && crad.d()) {
                    zB = true;
                }
                if (ctceVar.c()) {
                    zB = ctceVar.b();
                }
                return Boolean.valueOf(zB);
            }
        });
        fctd.a(new fdae() { // from class: ctcc
            @Override // defpackage.fdae
            public final Object invoke() {
                boolean zE;
                if (this.a.c()) {
                    zE = false;
                } else {
                    String str = Build.DEVICE;
                    str.getClass();
                    zE = ejuf.e("eos", str);
                }
                return Boolean.valueOf(zE);
            }
        });
        this.e = fctd.a(new fdae() { // from class: ctcd
            @Override // defpackage.fdae
            public final Object invoke() {
                boolean zE;
                if (this.a.c()) {
                    zE = false;
                } else {
                    String str = Build.DEVICE;
                    str.getClass();
                    zE = ejuf.e("r11", str);
                }
                return Boolean.valueOf(zE);
            }
        });
    }

    public final boolean a() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    public final boolean c() {
        if (((Boolean) a.e()).booleanValue()) {
            return true;
        }
        return ((Boolean) this.g.b()).booleanValue();
    }
}
