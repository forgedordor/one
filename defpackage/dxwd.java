package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxwd {
    public static final dxwd a;
    public static final dxwd b;
    private static final /* synthetic */ dxwd[] d;
    public final int c;

    static {
        dxwd dxwdVar = new dxwd("SYSTEM_TRAY", 0, 1);
        a = dxwdVar;
        dxwd dxwdVar2 = new dxwd("IN_APP", 1, 2);
        b = dxwdVar2;
        dxwd[] dxwdVarArr = {dxwdVar, dxwdVar2};
        d = dxwdVarArr;
        fczb.a(dxwdVarArr);
    }

    private dxwd(String str, int i, int i2) {
        this.c = i2;
    }

    public static dxwd[] values() {
        return (dxwd[]) d.clone();
    }
}
