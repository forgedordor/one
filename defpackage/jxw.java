package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxw {
    public static final hyr a = new hyu(new fdat() { // from class: jxq
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            jvr jvrVar = (jvr) obj2;
            Boolean boolValueOf = Boolean.valueOf(jvrVar.b);
            int i = jvrVar.c;
            return fcva.f(boolValueOf, new juv());
        }
    }, new fdap() { // from class: jxr
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            Boolean bool = obj2 != null ? (Boolean) obj2 : null;
            bool.getClass();
            boolean zBooleanValue = bool.booleanValue();
            Object obj3 = list.get(1);
            (obj3 != null ? (juv) obj3 : null).getClass();
            return new jvr(zBooleanValue);
        }
    });
    public static final hyr b = new hyu(new fdat() { // from class: jxs
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            return Integer.valueOf(((khd) obj2).a);
        }
    }, new fdap() { // from class: jxt
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            return new khd(((Integer) obj).intValue());
        }
    });
    public static final hyr c = new hyu(new fdat() { // from class: jxu
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            khw khwVar = (khw) obj2;
            return fcva.f(new khv(khwVar.b), Boolean.valueOf(khwVar.c));
        }
    }, new fdap() { // from class: jxv
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            khv khvVar = obj2 != null ? (khv) obj2 : null;
            khvVar.getClass();
            Object obj3 = list.get(1);
            Boolean bool = obj3 != null ? (Boolean) obj3 : null;
            bool.getClass();
            return new khw(khvVar.a, bool.booleanValue());
        }
    });
}
