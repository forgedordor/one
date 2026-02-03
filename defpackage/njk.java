package defpackage;

import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njk {
    public static final Comparator a = new Comparator() { // from class: njh
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((njj) obj).a - ((njj) obj2).a;
        }
    };
    public static final Comparator b = new Comparator() { // from class: nji
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((njj) obj).c, ((njj) obj2).c);
        }
    };
    public int f;
    public int g;
    public int h;
    public final njj[] d = new njj[5];
    public final ArrayList c = new ArrayList();
    public int e = -1;
}
