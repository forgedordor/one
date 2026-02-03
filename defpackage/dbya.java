package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dbya implements dbzt {
    static final ExperimentTokens[] a = new ExperimentTokens[0];
    static final String[] b = new String[0];

    @Deprecated
    public static final dcfe c;
    private static volatile int m = -1;
    private static final dcfd n;
    private static final dceu o;
    public final dbzv d;
    public final String e;
    public eyek f;
    protected final Context g;
    public final dbym h;
    public final String i;
    protected final String j;
    public final dcaa k;
    public final dbyu l;

    static {
        dcfd dcfdVar = new dcfd();
        n = dcfdVar;
        dbxy dbxyVar = new dbxy();
        o = dbxyVar;
        c = new dcfe("ClearcutLogger.API", dbxyVar, dcfdVar);
    }

    protected dbya(Context context, String str, String str2, dcaa dcaaVar, eyek eyekVar, dbym dbymVar, dbzv dbzvVar, dbyu dbyuVar) {
        if (!dcaaVar.a(dcab.ACCOUNT_NAME)) {
            dclh.b(str2 == null, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        d(dcaaVar);
        this.g = context.getApplicationContext();
        this.j = context.getPackageName();
        this.i = str;
        this.e = str2;
        this.k = dcaaVar;
        this.f = eyekVar == null ? eyek.DEFAULT : eyekVar;
        this.h = dbymVar == null ? new dcav(context) : dbymVar;
        this.d = dbzvVar == null ? new dcbe(context) : dbzvVar;
        this.l = dbyuVar;
    }

    static final int a(Context context) {
        if (m == -1) {
            synchronized (dbya.class) {
                if (m == -1) {
                    try {
                        m = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("AbstractClearcutLogger", "This can't happen.", e);
                    }
                }
            }
        }
        return m;
    }

    static final String c(Iterable iterable) {
        return new ejwc(", ").b(iterable);
    }

    static final void d(dcaa dcaaVar) {
        if (!dcaaVar.equals(dcaa.c) && !dcaaVar.equals(dcaa.a) && !dcaaVar.equals(dcaa.b)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    static final int[] f(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    @Override // defpackage.dbzt
    public final boolean e() {
        return this.k.equals(dcaa.b);
    }

    public final void g(eyek eyekVar) {
        if (eyekVar == null) {
            eyekVar = eyek.DEFAULT;
        }
        this.f = eyekVar;
    }
}
