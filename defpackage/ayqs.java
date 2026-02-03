package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayqs {
    public final Context a;
    public final cmop b;
    public final cqmp c;
    public final cogw d;
    public final bbfk e;

    public ayqs(Context context, cmop cmopVar, cqmp cqmpVar, cogw cogwVar, bbfk bbfkVar) {
        this.a = context;
        this.b = cmopVar;
        this.c = cqmpVar;
        this.d = cogwVar;
        this.e = bbfkVar;
    }

    public static void a(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            String[] strArr = PartsTable.a;
            bsjh bsjhVar = new bsjh();
            bsjhVar.ap("updateMessagePartsForResizingInTransaction");
            Uri uriW = messagePartCoreData.w();
            int iIntValue = PartsTable.e().intValue();
            int iIntValue2 = PartsTable.e().intValue();
            if (iIntValue2 < 4020) {
                dqru.x("output_uri", iIntValue2);
            }
            if (iIntValue >= 4020) {
                if (uriW == null) {
                    bsjhVar.a.putNull("output_uri");
                } else {
                    bsjhVar.a.put("output_uri", uriW.toString());
                }
            }
            bsjhVar.y(messagePartCoreData.p());
            bsjhVar.w(messagePartCoreData.H());
            bsjhVar.D(new Function() { // from class: ayqr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsjl bsjlVar = (bsjl) obj;
                    bsjlVar.j(messagePartCoreData.W());
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsjhVar.al();
            if (bsjhVar.b().e() > 0) {
                list2.add(messagePartCoreData);
            }
        }
    }
}
