package defpackage;

import android.R;
import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbe {
    public static final fbe a;
    public static final fbe b;
    public static final fbe c;
    public static final fbe d;
    public static final fbe e;
    private static final /* synthetic */ fbe[] g;
    public final int f;

    static {
        fbe fbeVar = new fbe("Cut", 0, R.string.cut);
        a = fbeVar;
        fbe fbeVar2 = new fbe("Copy", 1, R.string.copy);
        b = fbeVar2;
        fbe fbeVar3 = new fbe("Paste", 2, R.string.paste);
        c = fbeVar3;
        fbe fbeVar4 = new fbe("SelectAll", 3, R.string.selectAll);
        d = fbeVar4;
        fbe fbeVar5 = new fbe("Autofill", 4, Build.VERSION.SDK_INT <= 26 ? com.google.android.apps.messaging.R.string.autofill : R.string.autofill);
        e = fbeVar5;
        fbe[] fbeVarArr = {fbeVar, fbeVar2, fbeVar3, fbeVar4, fbeVar5};
        g = fbeVarArr;
        fczb.a(fbeVarArr);
    }

    private fbe(String str, int i, int i2) {
        this.f = i2;
    }

    public static fbe[] values() {
        return (fbe[]) g.clone();
    }
}
