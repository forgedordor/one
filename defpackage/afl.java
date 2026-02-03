package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afl {
    public final ajy a;

    public afl(ajy ajyVar) {
        lcg.i(ajyVar);
        this.a = ajyVar;
    }

    public final int d() {
        return this.a.c;
    }

    public final int e() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof afl) {
            return Objects.equals(this.a, ((afl) obj).a);
        }
        return false;
    }

    public final String f() {
        return this.a.i;
    }

    public final String g() {
        return this.a.a;
    }

    final void h(akf akfVar) {
        akfVar.a("{\n");
        akfVar.d();
        akfVar.a("name: \"");
        akfVar.a(g());
        akfVar.a("\",\n");
        akfVar.a("description: \"");
        akfVar.a(f());
        akfVar.a("\",\n");
        if (this instanceof afn) {
            afn afnVar = (afn) this;
            int iA = afnVar.a();
            if (iA == 0) {
                akfVar.a("indexingType: INDEXING_TYPE_NONE,\n");
            } else if (iA == 1) {
                akfVar.a("indexingType: INDEXING_TYPE_EXACT_TERMS,\n");
            } else if (iA != 2) {
                akfVar.a("indexingType: INDEXING_TYPE_UNKNOWN,\n");
            } else {
                akfVar.a("indexingType: INDEXING_TYPE_PREFIXES,\n");
            }
            int iC = afnVar.c();
            if (iC == 0) {
                akfVar.a("tokenizerType: TOKENIZER_TYPE_NONE,\n");
            } else if (iC == 1) {
                akfVar.a("tokenizerType: TOKENIZER_TYPE_PLAIN,\n");
            } else if (iC == 2) {
                akfVar.a("tokenizerType: TOKENIZER_TYPE_VERBATIM,\n");
            } else if (iC != 3) {
                akfVar.a("tokenizerType: TOKENIZER_TYPE_UNKNOWN,\n");
            } else {
                akfVar.a("tokenizerType: TOKENIZER_TYPE_RFC822,\n");
            }
            int iB = afnVar.b();
            if (iB == 0) {
                akfVar.a("joinableValueType: JOINABLE_VALUE_TYPE_NONE,\n");
            } else if (iB != 1) {
                akfVar.a("joinableValueType: JOINABLE_VALUE_TYPE_UNKNOWN,\n");
            } else {
                akfVar.a("joinableValueType: JOINABLE_VALUE_TYPE_QUALIFIED_ID,\n");
            }
            akfVar.a("deletePropagationType: DELETE_PROPAGATION_TYPE_NONE,\n");
        } else if (this instanceof aff) {
            aff affVar = (aff) this;
            akfVar.a("shouldIndexNestedProperties: ");
            akfVar.b(Boolean.valueOf(affVar.c()));
            akfVar.a(",\n");
            akfVar.a("indexableNestedProperties: ");
            akfVar.b(affVar.b());
            akfVar.a(",\n");
            akfVar.a("schemaType: \"");
            akfVar.a(affVar.a());
            akfVar.a("\",\n");
        } else if (this instanceof afk) {
            int iA2 = ((afk) this).a();
            if (iA2 == 0) {
                akfVar.a("indexingType: INDEXING_TYPE_NONE,\n");
            } else if (iA2 != 1) {
                akfVar.a("indexingType: INDEXING_TYPE_UNKNOWN,\n");
            } else {
                akfVar.a("indexingType: INDEXING_TYPE_RANGE,\n");
            }
        }
        int iD = d();
        if (iD == 1) {
            akfVar.a("cardinality: CARDINALITY_REPEATED,\n");
        } else if (iD == 2) {
            akfVar.a("cardinality: CARDINALITY_OPTIONAL,\n");
        } else if (iD != 3) {
            akfVar.a("cardinality: CARDINALITY_UNKNOWN,\n");
        } else {
            akfVar.a("cardinality: CARDINALITY_REQUIRED,\n");
        }
        switch (e()) {
            case 1:
                akfVar.a("dataType: DATA_TYPE_STRING,\n");
                break;
            case 2:
                akfVar.a("dataType: DATA_TYPE_LONG,\n");
                break;
            case 3:
                akfVar.a("dataType: DATA_TYPE_DOUBLE,\n");
                break;
            case 4:
                akfVar.a("dataType: DATA_TYPE_BOOLEAN,\n");
                break;
            case 5:
                akfVar.a("dataType: DATA_TYPE_BYTES,\n");
                break;
            case 6:
                akfVar.a("dataType: DATA_TYPE_DOCUMENT,\n");
                break;
            default:
                akfVar.a("dataType: DATA_TYPE_EMBEDDING,\n");
                break;
        }
        akfVar.c();
        akfVar.a("}");
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        akf akfVar = new akf();
        h(akfVar);
        return akfVar.toString();
    }
}
