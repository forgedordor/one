package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayoe {
    public static final cqce a = cqce.g("BugleAction", "ActionSerializer");
    public final fcsu b;
    private final fcsu c;

    public ayoe(fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = fcsuVar;
        this.b = fcsuVar2;
    }

    public static String e(aymo aymoVar) {
        return ayos.b(aymoVar.i());
    }

    private static Action f(String str, Parcel parcel) throws NoSuchFieldException {
        try {
            Field field = Class.forName(str).getField("CREATOR");
            if (!(field.get(null) instanceof Parcelable.Creator)) {
                throw new NoSuchFieldException(a.a(str, "CREATOR of ", " isn't a Parcelable.Creator<? extends Action>"));
            }
            Parcelable.Creator creator = (Parcelable.Creator) field.get(null);
            if (creator != null) {
                return (Action) creator.createFromParcel(parcel);
            }
            throw new NoSuchFieldException(a.v(str, "Failed to get CREATOR method of "));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Upgrade Exception when unparceling");
            cqbdVarE.I(str);
            cqbdVarE.A("Parcel", ayos.c(parcel));
            cqbdVarE.s(e);
            return null;
        }
    }

    public final Bundle a(Action action) {
        Bundle bundle = new Bundle();
        bundle.putString("bundle_action_name", action.getClass().getName());
        bundle.putString("bundle_action_key", action.u);
        bundle.putParcelable("bundle_action_params", action.v.i());
        return bundle;
    }

    public final Action b(String str, String str2, ActionParameters actionParameters) {
        Action actionC = null;
        if (TextUtils.isEmpty(str)) {
            a.r("No className found when unparceling action. Must be parceled via old way.");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("No key found when unparceling");
            cqbdVarE.I(str);
            cqbdVarE.I(". Must be parceled via old way.");
            cqbdVarE.r();
            return null;
        }
        if (actionParameters == null) {
            cqbd cqbdVarE2 = a.e();
            cqbdVarE2.I("No Params found when unparceling");
            cqbdVarE2.I(str);
            cqbdVarE2.I(". Must be parceled via old way.");
            cqbdVarE2.r();
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeString(str2);
                parcelObtain.writeParcelable(actionParameters, 0);
                parcelObtain.setDataPosition(0);
                try {
                    fcsu fcsuVar = (fcsu) ((Map) ((eyig) this.c).a).get(Class.forName(str));
                    if (fcsuVar == null) {
                        cqbd cqbdVarD = a.d();
                        cqbdVarD.I("No className found when unparceling");
                        cqbdVarD.I(str);
                        cqbdVarD.v(". Must be parceled via old way.");
                        cqbdVarD.r();
                    } else {
                        actionC = ((ayms) fcsuVar.b()).c(parcelObtain);
                    }
                } catch (ClassNotFoundException e) {
                    cqbd cqbdVarD2 = a.d();
                    cqbdVarD2.I("No className found when unparceling");
                    cqbdVarD2.I(str);
                    cqbdVarD2.v(". Must be parceled via old way.");
                    cqbdVarD2.s(e);
                }
                if (actionC != null) {
                    return actionC;
                }
                Action actionF = f(str, parcelObtain);
                cqaz.l(actionF);
                return actionF;
            } catch (RuntimeException e2) {
                e2.addSuppressed(new RuntimeException(a.n(ayos.c(parcelObtain), str, "Unexpected Exception when unparceling ", " with parcel ")));
                throw e2;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    public final Action c(Bundle bundle) {
        Action actionB = b(bundle.getString("bundle_action_name"), bundle.getString("bundle_action_key"), (ActionParameters) bundle.getParcelable("bundle_action_params"));
        return actionB != null ? actionB : (Action) bundle.getParcelable("bundle_action");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.messaging.shared.datamodel.action.common.Action d(android.os.PersistableBundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = "bundle_action_name"
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "bundle_action_key"
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r2 = "bundle_action_serialized_params"
            java.lang.String r2 = r7.getString(r2)
            r3 = 0
            if (r0 != 0) goto L1e
            cqce r0 = defpackage.ayoe.a
            java.lang.String r1 = "No className found when unparceling action. Must be parceled via old way."
            r0.r(r1)
        L1c:
            r0 = r3
            goto L84
        L1e:
            if (r1 != 0) goto L28
            cqce r0 = defpackage.ayoe.a
            java.lang.String r1 = "No key found when unparceling action. Must be parceled via old way."
            r0.r(r1)
            goto L1c
        L28:
            fcsu r4 = r6.b
            java.lang.Object r4 = r4.b()
            aooq r4 = (defpackage.aooq) r4
            boolean r4 = r4.a()
            if (r4 == 0) goto L6b
            java.lang.String r4 = "persistable_bundle_action_params"
            android.os.PersistableBundle r4 = r7.getPersistableBundle(r4)
            j$.util.Optional r4 = j$.util.Optional.ofNullable(r4)
            ayny r5 = new ayny
            r5.<init>()
            j$.util.Optional r4 = r4.map(r5)
            aynz r5 = new aynz
            r5.<init>()
            j$.util.Optional r4 = r4.map(r5)
            ayoa r5 = new ayoa
            r5.<init>()
            j$.util.Optional r2 = r4.or(r5)
            ayob r4 = new ayob
            r4.<init>()
            j$.util.Optional r0 = r2.map(r4)
            java.lang.Object r0 = r0.orElse(r3)
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r0 = (com.google.android.apps.messaging.shared.datamodel.action.common.Action) r0
            goto L84
        L6b:
            if (r2 != 0) goto L75
            cqce r0 = defpackage.ayoe.a
            java.lang.String r1 = "No byteString found when unparceling action. Must be parceled via old way."
            r0.r(r1)
            goto L1c
        L75:
            java.lang.Class<com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters> r4 = com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters.class
            java.lang.Object r2 = defpackage.ayos.a(r2, r4, r0)
            com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters r2 = (com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters) r2
            if (r2 != 0) goto L80
            goto L1c
        L80:
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r0 = r6.b(r0, r1, r2)
        L84:
            if (r0 != 0) goto La1
            java.lang.String r0 = "action_parcel"
            java.lang.String r7 = r7.getString(r0)
            if (r7 != 0) goto L96
            cqce r7 = defpackage.ayoe.a
            java.lang.String r0 = "No bytes found when unparceling action the old way"
            r7.r(r0)
            return r3
        L96:
            java.lang.Class<com.google.android.apps.messaging.shared.datamodel.action.common.Action> r0 = com.google.android.apps.messaging.shared.datamodel.action.common.Action.class
            java.lang.String r1 = "Action"
            java.lang.Object r7 = defpackage.ayos.a(r7, r0, r1)
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r7 = (com.google.android.apps.messaging.shared.datamodel.action.common.Action) r7
            return r7
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayoe.d(android.os.PersistableBundle):com.google.android.apps.messaging.shared.datamodel.action.common.Action");
    }
}
