package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class danu implements eora {
    final /* synthetic */ ddkb a;

    public danu(ddkb ddkbVar) {
        this.a = ddkbVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ListIterator listIterator = (ListIterator) obj;
        if (!listIterator.hasNext()) {
            this.a.b(null, null);
            return;
        }
        cdem cdemVar = (cdem) listIterator.next();
        long j = cdemVar.a;
        SmartSuggestionData smartSuggestionData = cdemVar.b;
        cczv cczvVar = danv.a;
        fgvo fgvoVar = (fgvo) fgvq.a.createBuilder();
        fgvoVar.a("timestamp", damm.a(j));
        String strA = dano.a(smartSuggestionData);
        if (!TextUtils.isEmpty(strA)) {
            fgvoVar.a("suggestion_text", damm.c(strA));
        }
        fgvoVar.a("suggestion_status", damm.a(smartSuggestionData.j().a()));
        fgvoVar.a("suggestion_type", damm.a(((SmartSuggestionItemSuggestionData) smartSuggestionData).l().a()));
        fgvk fgvkVar = (fgvk) fgvl.a.createBuilder();
        fgvq fgvqVar = (fgvq) fgvoVar.build();
        fgvkVar.copyOnWrite();
        fgvl fgvlVar = (fgvl) fgvkVar.instance;
        fgvqVar.getClass();
        fgvlVar.c = fgvqVar;
        fgvlVar.b |= 1;
        this.a.b(((fgvl) fgvkVar.build()).toByteArray(), null);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.a.a(13, null);
    }
}
