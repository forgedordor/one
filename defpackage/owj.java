package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owj extends ouh {
    public final List a = new ArrayList();

    @Override // defpackage.ouh
    public final void a(int i, int i2) {
        List list = this.a;
        list.add(0);
        list.add(Integer.valueOf(i));
        list.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ouh
    public final void b(int i, int i2) {
        List list = this.a;
        list.add(1);
        list.add(Integer.valueOf(i));
        list.add(Integer.valueOf(i2));
    }
}
