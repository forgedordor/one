package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.telecom.PhoneAccount;
import android.telephony.PhoneNumberUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cszd {
    public static final cqce a = cqce.g("Bugle", "VilteVideoCalling");
    public final Context b;
    public final fcsu c;
    private final eosc d;

    public cszd(Context context, fcsu fcsuVar, eosc eoscVar) {
        this.b = context;
        this.c = fcsuVar;
        this.d = eoscVar;
    }

    final eiju a(final List list) {
        return eijx.g(new Callable() { // from class: cszc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cszd cszdVar = this.a;
                PhoneAccount phoneAccountA = ((csyf) cszdVar.c.b()).a();
                List<ParticipantsTable.BindData> list2 = list;
                if (phoneAccountA == null || !phoneAccountA.hasCapabilities(8) || !phoneAccountA.hasCapabilities(256) || list2.isEmpty()) {
                    return list2;
                }
                String[] strArr = {"data1", "carrier_presence"};
                HashSet hashSet = new HashSet();
                ejwc ejwcVar = new ejwc(",");
                Stream map = Collection.EL.stream(list2).map(new Function() { // from class: csza
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(((ParticipantsTable.BindData) obj).u());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                try {
                    Cursor cursorA = new bacf(cszdVar.b, ContactsContract.Data.CONTENT_URI, strArr, "contact_id IN (" + ejwcVar.b((Iterable) map.collect(ekcv.a)) + ") AND mimetype=?", new String[]{"vnd.android.cursor.item/phone_v2"}, null).a();
                    if (cursorA != null) {
                        while (cursorA.moveToNext()) {
                            try {
                                if ((1 & cursorA.getInt(1)) != 0) {
                                    hashSet.add(PhoneNumberUtils.normalizeNumber(cursorA.getString(0)));
                                }
                            } finally {
                            }
                        }
                    }
                    if (cursorA != null) {
                        cursorA.close();
                    }
                } catch (Exception e) {
                    cszd.a.s("Failed to retrieve ViLTE video reachability", e);
                }
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (ParticipantsTable.BindData bindData : list2) {
                    String strR = bindData.R();
                    if (hashSet.contains(bindData.T())) {
                        arrayList.add(strR);
                    } else {
                        arrayList2.add(bindData);
                    }
                }
                bsbs bsbsVarF = ParticipantsTable.f();
                bsbsVarF.ak();
                bsbsVarF.ap("updateReachability");
                bsbsVarF.S(2);
                bsbsVarF.U(new Function() { // from class: cszb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsbx bsbxVar = (bsbx) obj;
                        bsbxVar.m(arrayList);
                        return bsbxVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsbsVarF.b().e();
                return arrayList2;
            }
        }, this.d);
    }
}
