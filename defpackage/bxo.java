package defpackage;

import android.util.Size;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bxo {
    private static final Set a;
    public static final bxo b;
    public static final bxo c;
    public static final bxo d;
    public static final bxo e;
    public static final bxo f;
    public static final bxo g;
    static final bxo h;
    public static final List i;

    static {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480)));
        int i2 = bxn.a;
        bwu bwuVar = new bwu(4, 2002, "SD", listUnmodifiableList);
        b = bwuVar;
        bwu bwuVar2 = new bwu(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        c = bwuVar2;
        bwu bwuVar3 = new bwu(6, 2004, "FHD", Collections.singletonList(new Size(1920, 1080)));
        d = bwuVar3;
        bwu bwuVar4 = new bwu(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        e = bwuVar4;
        bwu bwuVar5 = new bwu(0, 2000, "LOWEST", Collections.EMPTY_LIST);
        f = bwuVar5;
        bwu bwuVar6 = new bwu(1, 2001, "HIGHEST", Collections.EMPTY_LIST);
        g = bwuVar6;
        h = new bwu(-1, -1, "NONE", Collections.EMPTY_LIST);
        a = new HashSet(Arrays.asList(bwuVar5, bwuVar6, bwuVar, bwuVar2, bwuVar3, bwuVar4));
        i = Arrays.asList(bwuVar4, bwuVar3, bwuVar2, bwuVar);
    }

    public static boolean e(bxo bxoVar) {
        return a.contains(bxoVar);
    }
}
