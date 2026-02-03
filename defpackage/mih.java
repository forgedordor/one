package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mih extends mif {
    public final int c;
    public final Map d;

    public mih(int i, IOException iOException, Map map) {
        super(a.g(i, "Response code: "), iOException, 2004);
        this.c = i;
        this.d = map;
    }
}
