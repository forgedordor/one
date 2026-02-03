package defpackage;

import android.app.appsearch.GenericDocument;
import android.app.appsearch.Migrator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajg extends Migrator {
    final /* synthetic */ agc a;

    public ajg(agc agcVar) {
        this.a = agcVar;
    }

    public final GenericDocument onDowngrade(int i, int i2, GenericDocument genericDocument) {
        agc agcVar = this.a;
        afv afvVarB = air.b(genericDocument);
        afv afvVarC = agcVar.c();
        return afvVarB.equals(afvVarC) ? genericDocument : air.a(afvVarC);
    }

    public final GenericDocument onUpgrade(int i, int i2, GenericDocument genericDocument) {
        agc agcVar = this.a;
        afv afvVarB = air.b(genericDocument);
        afv afvVarA = agcVar.a(i, i2, afvVarB);
        return afvVarB.equals(afvVarA) ? genericDocument : air.a(afvVarA);
    }

    public final boolean shouldMigrate(int i, int i2) {
        return this.a.b(i, i2);
    }
}
