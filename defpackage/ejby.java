package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejby implements xp {
    public final Handler b;
    public final ejbv c;
    public String e;
    private final ejcb f;
    public final Runnable a = new Runnable() { // from class: ejbw
        @Override // java.lang.Runnable
        public final void run() {
            this.a.c();
        }
    };
    public volatile ejbz d = null;
    private final int g = 500;

    public ejby(ejca ejcaVar) {
        this.c = new ejbv(ejcaVar);
        Handler handler = new Handler(Looper.getMainLooper());
        this.b = handler;
        this.f = new ejcb(handler);
    }

    @Override // defpackage.xp
    public final void a(String str) {
        this.e = str;
        Handler handler = this.b;
        Runnable runnable = this.a;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, this.g);
    }

    @Override // defpackage.xp
    public final void b(String str) {
        this.b.removeCallbacks(this.a);
        this.e = str;
        c();
    }

    public final void c() {
        String str = this.e;
        eylu eyluVar = (eylu) eylv.a.createBuilder();
        eyluVar.copyOnWrite();
        ((eylv) eyluVar.instance).d = 7;
        eyluVar.copyOnWrite();
        ((eylv) eyluVar.instance).b = 0;
        eyluVar.copyOnWrite();
        ((eylv) eyluVar.instance).e = feln.a(4);
        eyluVar.copyOnWrite();
        ((eylv) eyluVar.instance).c = 0;
        eylk eylkVar = (eylk) eyll.a.createBuilder();
        String str2 = true != TextUtils.isEmpty(str) ? str : "hello";
        eylkVar.copyOnWrite();
        eyll eyllVar = (eyll) eylkVar.instance;
        str2.getClass();
        eyllVar.c = str2;
        eylkVar.copyOnWrite();
        ((eyll) eylkVar.instance).d = 20;
        eylkVar.copyOnWrite();
        eyll eyllVar2 = (eyll) eylkVar.instance;
        eylv eylvVar = (eylv) eyluVar.build();
        eylvVar.getClass();
        eyllVar2.i = eylvVar;
        eyllVar2.b |= 32;
        ejbv ejbvVar = this.c;
        eylr eylrVar = ejbvVar.b;
        if (eylrVar != null) {
            eylkVar.copyOnWrite();
            eyll eyllVar3 = (eyll) eylkVar.instance;
            eyllVar3.e = eylrVar;
            eyllVar3.b |= 2;
        }
        if (ejbvVar.c != 0) {
            eyls eylsVar = (eyls) eylt.a.createBuilder();
            int i = ejbvVar.c;
            eylsVar.copyOnWrite();
            ((eylt) eylsVar.instance).b = i;
            eylkVar.copyOnWrite();
            eyll eyllVar4 = (eyll) eylkVar.instance;
            eylt eyltVar = (eylt) eylsVar.build();
            eyltVar.getClass();
            eyllVar4.g = eyltVar;
            eyllVar4.b |= 8;
        }
        eylr eylrVar2 = ejbvVar.d;
        if (eylrVar2 != null) {
            eylkVar.copyOnWrite();
            eyll eyllVar5 = (eyll) eylkVar.instance;
            eyllVar5.f = eylrVar2;
            eyllVar5.b |= 4;
        }
        if (ejbvVar.e != 0) {
            eyls eylsVar2 = (eyls) eylt.a.createBuilder();
            int i2 = ejbvVar.e;
            eylsVar2.copyOnWrite();
            ((eylt) eylsVar2.instance).b = i2;
            eylkVar.copyOnWrite();
            eyll eyllVar6 = (eyll) eylkVar.instance;
            eylt eyltVar2 = (eylt) eylsVar2.build();
            eyltVar2.getClass();
            eyllVar6.h = eyltVar2;
            eyllVar6.b |= 16;
        }
        eork.r(ejbvVar.a.a((eyll) eylkVar.build()), new ejbx(this, str), this.f);
    }
}
