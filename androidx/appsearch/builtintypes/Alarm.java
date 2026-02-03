package androidx.appsearch.builtintypes;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Alarm extends Thing {
    public final boolean a;
    public final int[] b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final AlarmInstance i;
    public final AlarmInstance j;
    public final int k;

    public Alarm(String str, String str2, int i, long j, long j2, String str3, List list, String str4, String str5, String str6, List list2, boolean z, int[] iArr, int i2, int i3, String str7, String str8, String str9, boolean z2, AlarmInstance alarmInstance, AlarmInstance alarmInstance2, int i4) {
        super(str, str2, i, j, j2, str3, list, str4, str5, str6, list2);
        this.a = z;
        this.b = iArr;
        this.c = i2;
        this.d = i3;
        this.e = str7;
        this.f = str8;
        this.g = str9;
        this.h = z2;
        this.i = alarmInstance;
        this.j = alarmInstance2;
        this.k = i4;
    }
}
