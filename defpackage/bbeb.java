package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbeb implements alff {
    public final /* synthetic */ SmartSuggestionItemSuggestionData a;
    private final String b;
    private final alfd c = alfd.i;

    public bbeb(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData) {
        this.a = smartSuggestionItemSuggestionData;
        this.b = smartSuggestionItemSuggestionData.a;
    }

    @Override // defpackage.alff
    public final alfd a() {
        return this.c;
    }

    @Override // defpackage.alff
    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a.u();
    }
}
