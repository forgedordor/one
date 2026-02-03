package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcix extends ea implements dchu {
    public static final WeakHashMap a = new WeakHashMap();
    private final dchx b = new dchx();

    @Override // defpackage.dchu
    public final Activity a() {
        return G();
    }

    @Override // defpackage.ea
    public final void ac(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.ac(str, fileDescriptor, printWriter, strArr);
        this.b.h();
    }

    @Override // defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        super.af(i, i2, intent);
        this.b.a(i, i2, intent);
    }

    @Override // defpackage.ea
    public final void ai() {
        super.ai();
        this.b.c();
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        this.b.d();
    }

    @Override // defpackage.dchu
    public final void b(dcht dchtVar) {
        this.b.i(dchtVar);
    }

    @Override // defpackage.dchu
    public final dcht c(Class cls) {
        return this.b.j(cls);
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.b.b(bundle);
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        this.b.e(bundle);
    }

    @Override // defpackage.ea
    public final void l() {
        super.l();
        this.b.f();
    }

    @Override // defpackage.ea
    public final void m() {
        super.m();
        this.b.g();
    }
}
