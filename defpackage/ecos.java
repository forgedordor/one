package defpackage;

import android.content.ContentValues;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecos extends ecpf {
    public ContentValues a;
    public ekgb b;
    public ekgb c;
    public String d;
    public ecpe e;

    @Override // defpackage.ecpf
    public final ContentValues a() {
        ContentValues contentValues = this.a;
        if (contentValues != null) {
            return contentValues;
        }
        throw new IllegalStateException("Property \"values\" has not been set");
    }

    @Override // defpackage.ecpf
    public final void b(List list) {
        this.b = ekgb.n(list);
    }

    @Override // defpackage.ecpf
    public final void c(List list) {
        this.c = ekgb.n(list);
    }
}
