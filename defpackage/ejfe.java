package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejfe {
    public static final ejfe a;
    public static final ejfe b;
    public static final ejfe c;
    private static final /* synthetic */ ejfe[] d;

    static {
        ejfe ejfeVar = new ejfe("LOADING", 0);
        a = ejfeVar;
        ejfe ejfeVar2 = new ejfe("HIGHLIGHT_SUGGESTIONS", 1);
        b = ejfeVar2;
        ejfe ejfeVar3 = new ejfe("SENDING", 2);
        c = ejfeVar3;
        ejfe[] ejfeVarArr = {ejfeVar, ejfeVar2, ejfeVar3};
        d = ejfeVarArr;
        fczb.a(ejfeVarArr);
    }

    private ejfe(String str, int i) {
    }

    public static ejfe[] values() {
        return (ejfe[]) d.clone();
    }
}
