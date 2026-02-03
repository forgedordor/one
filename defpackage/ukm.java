package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ukm implements einb {

    /* compiled from: PG */
    public final class a extends ukm {
        public final View a;

        public a(View view) {
            this.a = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && fdbq.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CameraGallery(view=" + this.a + ")";
        }
    }

    /* compiled from: PG */
    public final class b extends ukm {
        public final View a;

        public b(View view) {
            this.a = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && fdbq.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Contacts(view=" + this.a + ")";
        }
    }

    /* compiled from: PG */
    public final class c extends ukm {
        public final View a;

        public c(View view) {
            this.a = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && fdbq.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Files(view=" + this.a + ")";
        }
    }

    /* compiled from: PG */
    public final class d extends ukm {
        public final dpxe a;
        private final View b;

        public d(View view, dpxe dpxeVar) {
            dpxeVar.getClass();
            this.b = view;
            this.a = dpxeVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return fdbq.f(this.b, dVar.b) && this.a == dVar.a;
        }

        public final int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }

        public final String toString() {
            return "GifsStickers(view=" + this.b + ", category=" + this.a + ")";
        }
    }

    /* compiled from: PG */
    public final class e extends ukm {
        public final View a;

        public e(View view) {
            this.a = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && fdbq.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Location(view=" + this.a + ")";
        }
    }

    /* compiled from: PG */
    public final class f extends ukm {
        public final View a;

        public f(View view) {
            this.a = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && fdbq.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ScheduledSend(view=" + this.a + ")";
        }
    }
}
