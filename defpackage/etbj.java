package defpackage;

import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class etbj {
    final String g;
    public final Field h;
    final String i;

    protected etbj(String str, Field field) {
        this.g = str;
        this.h = field;
        this.i = field.getName();
    }

    public abstract void a(etdb etdbVar, int i, Object[] objArr);

    public abstract void b(etdb etdbVar, Object obj);

    public abstract void c(etdd etddVar, Object obj);
}
