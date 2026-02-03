package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hss extends hty {
    public static final hss a = new hss();

    private hss() {
        super(0, 2, 1);
    }

    @Override // defpackage.hty
    protected final void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        int i = ((hxg) hudVar.c(0)).a;
        List list = (List) hudVar.c(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            hlwVar.i(i3, obj);
            hlwVar.j(i3, obj);
        }
    }
}
