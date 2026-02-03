package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eqer implements Function {
    public static final eqdo a(ezse ezseVar) {
        eqdm eqdmVar;
        eqdk eqdkVar;
        eqdl eqdlVar;
        eqde eqdeVar = new eqde();
        eqdeVar.a(eqdk.a);
        eqdeVar.b(eqdl.a);
        Function function = eqft.b;
        int i = ezseVar.b;
        ezsc ezscVar = null;
        ezsd ezsdVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : ezsd.REMOVAL_ALLOWED_FOR_ADMINS : ezsd.REMOVAL_ALLOWED_FOR_ALL : ezsd.NO_USER_REMOVAL_ALLOWED : ezsd.UNKNOWN_REMOVAL_POLICY;
        if (ezsdVar == null) {
            ezsdVar = ezsd.UNRECOGNIZED;
        }
        eqdn eqdnVar = (eqdn) function.apply(ezsdVar);
        if (eqdnVar == null) {
            throw new NullPointerException("Null userRemovalPolicy");
        }
        eqdeVar.a = eqdnVar;
        Function function2 = eqft.a;
        int i2 = ezseVar.c;
        ezsb ezsbVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : ezsb.RENAMING_ALLOWED : ezsb.NO_RENAMING_ALLOWED : ezsb.UNKNOWN_RENAMING_POLICY;
        if (ezsbVar == null) {
            ezsbVar = ezsb.UNRECOGNIZED;
        }
        eqdm eqdmVar2 = (eqdm) function2.apply(ezsbVar);
        if (eqdmVar2 == null) {
            throw new NullPointerException("Null renamingPolicy");
        }
        eqdeVar.b = eqdmVar2;
        Function function3 = eqft.c;
        int i3 = ezseVar.d;
        ezsa ezsaVar = i3 != 0 ? i3 != 1 ? i3 != 2 ? null : ezsa.GROUP_ICON_MODIFICATION_ALLOWED : ezsa.NO_GROUP_ICON_MODIFICATION_ALLOWED : ezsa.UNKNOWN_GROUP_ICON_MODIFICATION_POLICY;
        if (ezsaVar == null) {
            ezsaVar = ezsa.UNRECOGNIZED;
        }
        eqdeVar.a((eqdk) function3.apply(ezsaVar));
        Function function4 = eqft.d;
        int i4 = ezseVar.e;
        if (i4 == 0) {
            ezscVar = ezsc.UNKNOWN_JOIN_BY_LINK_POLICY;
        } else if (i4 == 1) {
            ezscVar = ezsc.NO_JOIN_BY_LINK_ALLOWED;
        } else if (i4 == 2) {
            ezscVar = ezsc.JOIN_BY_LINK_ALLOWED;
        }
        if (ezscVar == null) {
            ezscVar = ezsc.UNRECOGNIZED;
        }
        eqdeVar.b((eqdl) function4.apply(ezscVar));
        eqdn eqdnVar2 = eqdeVar.a;
        if (eqdnVar2 != null && (eqdmVar = eqdeVar.b) != null && (eqdkVar = eqdeVar.c) != null && (eqdlVar = eqdeVar.d) != null) {
            return new eqdf(eqdnVar2, eqdmVar, eqdkVar, eqdlVar);
        }
        StringBuilder sb = new StringBuilder();
        if (eqdeVar.a == null) {
            sb.append(" userRemovalPolicy");
        }
        if (eqdeVar.b == null) {
            sb.append(" renamingPolicy");
        }
        if (eqdeVar.c == null) {
            sb.append(" groupIconModificationPolicy");
        }
        if (eqdeVar.d == null) {
            sb.append(" joinByLinkPolicy");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        throw null;
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        throw null;
    }
}
