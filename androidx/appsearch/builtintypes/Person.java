package androidx.appsearch.builtintypes;

import defpackage.ahl;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Person extends Thing {
    public final String a;
    public final String b;
    public final String c;
    final String d;
    final String e;
    final boolean f;
    final boolean g;
    public final List h;
    final List i;
    final List j;
    public final List k;
    public final List l;
    public final List m;

    public Person(String str, String str2, int i, long j, long j2, String str3, List list, String str4, String str5, String str6, List list2, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, List list3, List list4, List list5, List list6, List list7, List list8) {
        super(str, str2, i, j, j2, str3, list, str4, str5, str6, list2);
        this.a = str7;
        this.b = str8;
        this.c = str9;
        this.d = str10;
        this.e = str11;
        this.f = z;
        this.g = z2;
        this.h = DesugarCollections.unmodifiableList(list3);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(list4);
        this.i = listUnmodifiableList;
        this.j = DesugarCollections.unmodifiableList(list5);
        this.k = DesugarCollections.unmodifiableList(list6);
        this.l = DesugarCollections.unmodifiableList(list7);
        this.m = DesugarCollections.unmodifiableList(list8);
        ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            arrayList.add(new ahl(((Long) this.i.get(i2)).intValue(), (String) this.j.get(i2)));
        }
        DesugarCollections.unmodifiableList(arrayList);
    }
}
