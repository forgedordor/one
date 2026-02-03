package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqyp {
    public final List a = new ArrayList();

    public static final Iterable as(Iterable iterable) {
        return ekis.f(iterable, new ejvr() { // from class: dqym
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (obj == null) {
                    return null;
                }
                return obj instanceof Boolean ? true != ((Boolean) obj).booleanValue() ? "0" : "1" : obj instanceof Enum ? Integer.toString(((Enum) obj).ordinal()) : obj.toString();
            }
        });
    }

    public static final Iterable at(int[] iArr) {
        return ekjz.g(dqru.p(iArr, Integer.class), new ejvr() { // from class: dqyl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return String.valueOf((Integer) obj);
            }
        });
    }

    public static final Iterable au(String... strArr) {
        return ekjz.g(Arrays.asList(strArr), new ejvr() { // from class: dqyk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (String) obj;
            }
        });
    }

    public abstract dqyj a();

    public final void ap(dqyq dqyqVar) {
        this.a.add(dqyqVar);
    }

    public final void aq(dqyp... dqypVarArr) {
        ap(new dquv(dqypVarArr));
    }

    public final void ar(dqxe dqxeVar) {
        ap(new dqtn(dqxeVar));
    }
}
