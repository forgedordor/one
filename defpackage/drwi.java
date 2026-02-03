package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drwi implements SharedPreferences.Editor {
    private final Context a;
    private final String b;
    private final ArrayList c = new ArrayList();
    private boolean d = false;

    public drwi(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final synchronized void a() {
        this.c.clear();
        this.d = true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        eork.m(new Callable() { // from class: drwh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.commit());
            }
        }, drle.a().e);
    }

    public final synchronized void b(String str, boolean z) {
        drwn drwnVar = (drwn) drwp.a.createBuilder();
        drwnVar.copyOnWrite();
        drwp drwpVar = (drwp) drwnVar.instance;
        str.getClass();
        drwpVar.b |= 1;
        drwpVar.e = str;
        drwnVar.copyOnWrite();
        drwp drwpVar2 = (drwp) drwnVar.instance;
        drwpVar2.c = 2;
        drwpVar2.d = Boolean.valueOf(z);
        this.c.add((drwp) drwnVar.build());
    }

    public final synchronized void c(String str, float f) {
        drwn drwnVar = (drwn) drwp.a.createBuilder();
        drwnVar.copyOnWrite();
        drwp drwpVar = (drwp) drwnVar.instance;
        str.getClass();
        drwpVar.b |= 1;
        drwpVar.e = str;
        drwnVar.copyOnWrite();
        drwp drwpVar2 = (drwp) drwnVar.instance;
        drwpVar2.c = 5;
        drwpVar2.d = Float.valueOf(f);
        this.c.add((drwp) drwnVar.build());
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
        a();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0088  */
    @Override // android.content.SharedPreferences.Editor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean commit() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drwi.commit():boolean");
    }

    public final synchronized void d(String str, int i) {
        drwn drwnVar = (drwn) drwp.a.createBuilder();
        drwnVar.copyOnWrite();
        drwp drwpVar = (drwp) drwnVar.instance;
        str.getClass();
        drwpVar.b |= 1;
        drwpVar.e = str;
        drwnVar.copyOnWrite();
        drwp drwpVar2 = (drwp) drwnVar.instance;
        drwpVar2.c = 3;
        drwpVar2.d = Integer.valueOf(i);
        this.c.add((drwp) drwnVar.build());
    }

    public final synchronized void e(String str, long j) {
        drwn drwnVar = (drwn) drwp.a.createBuilder();
        drwnVar.copyOnWrite();
        drwp drwpVar = (drwp) drwnVar.instance;
        str.getClass();
        drwpVar.b |= 1;
        drwpVar.e = str;
        drwnVar.copyOnWrite();
        drwp drwpVar2 = (drwp) drwnVar.instance;
        drwpVar2.c = 4;
        drwpVar2.d = Long.valueOf(j);
        this.c.add((drwp) drwnVar.build());
    }

    public final synchronized void f(String str) {
        drwn drwnVar = (drwn) drwp.a.createBuilder();
        drwnVar.copyOnWrite();
        drwp drwpVar = (drwp) drwnVar.instance;
        str.getClass();
        drwpVar.b |= 1;
        drwpVar.e = str;
        this.c.add((drwp) drwnVar.build());
    }

    public final synchronized void g(String str, String str2) {
        if (str2 == null) {
            f(str);
            return;
        }
        ArrayList arrayList = this.c;
        drwn drwnVar = (drwn) drwp.a.createBuilder();
        drwnVar.copyOnWrite();
        drwp drwpVar = (drwp) drwnVar.instance;
        str.getClass();
        drwpVar.b |= 1;
        drwpVar.e = str;
        drwnVar.copyOnWrite();
        drwp drwpVar2 = (drwp) drwnVar.instance;
        drwpVar2.c = 6;
        drwpVar2.d = str2;
        arrayList.add((drwp) drwnVar.build());
    }

    public final synchronized void h(String str, Set set) {
        if (set == null) {
            f(str);
            return;
        }
        ArrayList arrayList = this.c;
        drwn drwnVar = (drwn) drwp.a.createBuilder();
        drwnVar.copyOnWrite();
        drwp drwpVar = (drwp) drwnVar.instance;
        str.getClass();
        drwpVar.b |= 1;
        drwpVar.e = str;
        drxc drxcVar = (drxc) drxd.a.createBuilder();
        drxcVar.copyOnWrite();
        drxd drxdVar = (drxd) drxcVar.instance;
        evtg evtgVar = drxdVar.b;
        if (!evtgVar.c()) {
            drxdVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(set, drxdVar.b);
        drwnVar.copyOnWrite();
        drwp drwpVar2 = (drwp) drwnVar.instance;
        drxd drxdVar2 = (drxd) drxcVar.build();
        drxdVar2.getClass();
        drwpVar2.d = drxdVar2;
        drwpVar2.c = 7;
        arrayList.add((drwp) drwnVar.build());
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
        b(str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String str, float f) {
        c(str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
        d(str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String str, long j) {
        e(str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        g(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        h(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
        f(str);
        return this;
    }
}
