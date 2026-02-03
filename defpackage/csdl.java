package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csdl {
    public static final csdl a;
    public static final csdl b;
    public static final csdl c;
    public static final csdl d;
    public static final csdl e;
    public static final csdl f;
    public static final csdl g;
    public static final csdl h;
    public static final csdl i;
    public static final csdl j;
    public static final csdl k;
    public static final csdl l;
    public static final /* synthetic */ fcza m;
    private static final Set o;
    private static final /* synthetic */ csdl[] p;
    public final int n;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        csdl csdlVar = new csdl("UNKNOWN", 0, 0);
        a = csdlVar;
        csdl csdlVar2 = new csdl("USER", 1, 2);
        b = csdlVar2;
        csdl csdlVar3 = new csdl("SCOOBY", 2, 4);
        c = csdlVar3;
        csdl csdlVar4 = new csdl("RCS_ENFORCEMENT", 3, 8);
        d = csdlVar4;
        csdl csdlVar5 = new csdl("LINGUA", 4, 16);
        e = csdlVar5;
        csdl csdlVar6 = new csdl("STRANGER_DANGER", 5, 32);
        f = csdlVar6;
        csdl csdlVar7 = new csdl("SAFE_URL", 6, 64);
        g = csdlVar7;
        csdl csdlVar8 = new csdl("HADES_REGEX_AND_MODELS", 7, 128);
        h = csdlVar8;
        csdl csdlVar9 = new csdl("ON_DEVICE_STRANGER_DANGER", 8, 256);
        i = csdlVar9;
        csdl csdlVar10 = new csdl("IN_APK_FUZZY_MATCHING", 9, 512);
        j = csdlVar10;
        csdl csdlVar11 = new csdl("PENPAL", 10, 1024);
        k = csdlVar11;
        csdl csdlVar12 = new csdl("MESSAGE_SCAM_GUARD", 11, 2048);
        l = csdlVar12;
        csdl[] csdlVarArr = {csdlVar, csdlVar2, csdlVar3, csdlVar4, csdlVar5, csdlVar6, csdlVar7, csdlVar8, csdlVar9, csdlVar10, csdlVar11, csdlVar12};
        p = csdlVarArr;
        fcza fczaVarA = fczb.a(csdlVarArr);
        m = fczaVarA;
        ArrayList arrayList = new ArrayList();
        fcue fcueVar = new fcue((fcuh) fczaVarA);
        while (fcueVar.hasNext()) {
            Object next = fcueVar.next();
            csdl csdlVar13 = (csdl) next;
            if (!csdlVar13.c() && csdlVar13 != a) {
                arrayList.add(next);
            }
        }
        o = fcva.av(arrayList);
    }

    private csdl(String str, int i2, int i3) {
        this.n = i3;
    }

    public static csdl[] values() {
        return (csdl[]) p.clone();
    }

    public final eofd a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return eofd.UNKNOWN_CLASSIFICATION_SOURCE;
        }
        switch (iOrdinal) {
            case 2:
                return eofd.SCOOBY;
            case 3:
                return eofd.RCS_ENFORCEMENT;
            case 4:
                return eofd.LINGUA;
            case 5:
                return eofd.STRANGER_DANGER;
            case 6:
                return eofd.SAFE_URL;
            case 7:
                return eofd.HADES_REGEX_AND_MODELS;
            case 8:
                return eofd.ON_DEVICE_STRANGER_DANGER;
            case 9:
                return eofd.IN_APK_FUZZY_MATCHING;
            case 10:
                return eofd.PENPAL;
            case 11:
                return eofd.MESSAGE_SCAM_GUARD;
            default:
                toString();
                throw new IllegalStateException(toString().concat(" unsupported for Spam.ClassificationSource"));
        }
    }

    public final boolean b() {
        return o.contains(this);
    }

    public final boolean c() {
        return this == b;
    }
}
