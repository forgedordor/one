package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbeg implements alff {
    public final String a;
    public final String b;
    private final String c;
    private final alfd d = alfd.l;

    public bbeg(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData) {
        this.c = smartSuggestionItemSuggestionData.a;
        this.a = smartSuggestionItemSuggestionData.d();
        this.b = smartSuggestionItemSuggestionData.a();
    }

    @Override // defpackage.alff
    public final alfd a() {
        return this.d;
    }

    @Override // defpackage.alff
    public final String b() {
        return this.c;
    }
}
