package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amgg {
    public static final amgg a;
    private static final /* synthetic */ amgg[] g;
    public final ekgb b;
    public final ekgb c;
    public final fdat d;
    public final fdat e;
    public final fdat f;

    static {
        bran branVar = MessagesTable.c;
        ekgb ekgbVarS = ekgb.s(new brdo(branVar.i, false), new brdo(branVar.a, false));
        ekgbVarS.getClass();
        bran branVar2 = MessagesTable.c;
        ekgb ekgbVarS2 = ekgb.s(new brdo(branVar2.i, true), new brdo(branVar2.a, true));
        ekgbVarS2.getClass();
        amgg amggVar = new amgg(ekgbVarS, ekgbVarS2, amgd.a, amge.a, amgf.a);
        a = amggVar;
        amgg[] amggVarArr = {amggVar};
        g = amggVarArr;
        fczb.a(amggVarArr);
    }

    private amgg(ekgb ekgbVar, ekgb ekgbVar2, fdat fdatVar, fdat fdatVar2, fdat fdatVar3) {
        this.b = ekgbVar;
        this.c = ekgbVar2;
        this.d = fdatVar;
        this.e = fdatVar2;
        this.f = fdatVar3;
    }

    public static amgg[] values() {
        return (amgg[]) g.clone();
    }
}
