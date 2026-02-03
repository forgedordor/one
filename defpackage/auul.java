package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auul implements auuh {
    private final alrj a;

    public auul(alrj alrjVar) {
        this.a = alrjVar;
    }

    @Override // defpackage.auuh
    public final chvf a(Context context, int i, MessageIdType messageIdType, ekgb ekgbVar, String str) {
        ArrayList<? extends Parcelable> arrayList;
        try {
            Intent intent = new Intent(context, (Class<?>) auuf.class);
            intent.setAction("com.google.android.apps.messaging.cloudsync.internal.action.SEND_MESSAGE_RESULT");
            intent.putExtra("com.google.android.apps.messaging.cloudsync.internal.extra.REQUEST_ID", messageIdType.b());
            intent.putExtra("com.google.android.apps.messaging.cloudsync.internal.extra.SUB_ID", i);
            Intent intent2 = new Intent("com.google.android.apps.messaging.cloudsync.action.SEND_MESSAGE");
            intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.OTHER_PARTICIPANTS", (String[]) Collection.EL.stream(ekgbVar).map(new Function() { // from class: auui
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ejwk.b(((alqm) obj).n());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).toArray(new IntFunction() { // from class: auuj
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return new String[i2];
                }
            }));
            cczv cczvVar = alvx.a;
            if (((Boolean) new alvq().get()).booleanValue()) {
                if (((Boolean) new alve().get()).booleanValue()) {
                    Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: auuk
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return alre.d((alqm) obj);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i2 = ekgb.d;
                    arrayList = new ArrayList<>((java.util.Collection<? extends Object>) map.collect(ekcv.a));
                } else {
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    int size = ekgbVar.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        arrayList2.add(alre.d(this.a.u(((alqm) ekgbVar.get(i3)).n(), i)));
                    }
                    arrayList = arrayList2;
                }
                intent2.putParcelableArrayListExtra("com.google.android.apps.messaging.cloudsync.extra.OTHER_PARTICIPANTS_MI", arrayList);
            }
            intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.TEXT", str);
            intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.PENDING_INTENT", PendingIntent.getBroadcast(context, 0, intent, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)));
            auun.a(context, intent2);
            return chvf.i;
        } catch (Exception e) {
            cqca.h("BugleWearable", e, "CloudSyncSender: failed to send cloud sync message ".concat(e.toString()));
            chve chveVarJ = chvf.j(2, 0);
            chveVarJ.b(1);
            return chveVarJ.a();
        }
    }

    @Override // defpackage.auuh
    public final void b(Context context, String[] strArr) {
        Intent intent = new Intent("com.google.android.apps.messaging.cloudsync.action.DELETE_MESSAGES");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.IDS", strArr);
        auun.a(context, intent);
    }

    @Override // defpackage.auuh
    public final void c(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) auuf.class);
        intent.setAction("com.google.android.apps.messaging.cloudsync.internal.action.ACTION_ATTACHMENTS_DOWNLOADED");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.ID", str);
        Intent intent2 = new Intent("com.google.android.apps.messaging.cloudsync.action.DOWNLOAD_ATTACHMENTS");
        intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.ID", str);
        intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.PENDING_INTENT", PendingIntent.getBroadcast(context, 0, intent, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        intent2.putExtras(bundle);
        auun.a(context, intent2);
    }

    @Override // defpackage.auuh
    public final void d(Context context, String[] strArr) {
        Intent intent = new Intent("com.google.android.apps.messaging.cloudsync.action.GET_MESSAGES");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.IDS", strArr);
        auun.a(context, intent);
    }

    @Override // defpackage.auuh
    public final void e(Context context, String[] strArr) {
        Intent intent = new Intent("com.google.android.apps.messaging.cloudsync.action.UPDATE_MESSAGES");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.IDS", strArr);
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.NOTIFIED", true);
        auun.a(context, intent);
    }

    @Override // defpackage.auuh
    public final void f(Context context, String[] strArr, boolean z) {
        Intent intent = new Intent("com.google.android.apps.messaging.cloudsync.action.UPDATE_MESSAGES");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.IDS", strArr);
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.READ", true);
        if (z) {
            intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.NOTIFIED", true);
        }
        auun.a(context, intent);
    }
}
