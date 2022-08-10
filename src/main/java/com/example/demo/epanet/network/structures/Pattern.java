/*
 * Copyright (C) 2012  Addition, Lda. (addition at addition dot pt)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */

package com.example.demo.epanet.network.structures;

import com.example.demo.epanet.util.DblList;

import java.util.List;
import java.util.Objects;

/**
 * Temporal pattern.
 */
public class Pattern {
    /**
     * Pattern factors list.
     */
    private final DblList factors;
    /**
     * Pattern name.
     */
    private String id;

    public Pattern() {
        this.id = "";
        factors = new DblList();
    }

    public void add(Double factor) {
        factors.add(factor);
    }


    public List<Double> getFactorsList() {
        return factors;
    }

    public String getId() {
        return id;
    }

    public int getLength() {
        return factors.size();
    }

    public void setId(String text) {
        id = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pattern pattern = (Pattern) o;
        return Objects.equals(id, pattern.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
