package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoro {
    public static final eoro a;
    public static final Set b;
    private static final /* synthetic */ eoro[] c;

    static {
        eoro eoroVar = new eoro();
        a = eoroVar;
        c = new eoro[]{eoroVar};
        b = new CopyOnWriteArraySet();
    }

    private eoro() {
    }

    public static eoro[] values() {
        return (eoro[]) c.clone();
    }
}
